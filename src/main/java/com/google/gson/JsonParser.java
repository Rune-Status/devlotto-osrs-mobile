package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class JsonParser {
    public JsonElement parse(JsonReader jsonReader) throws JsonIOException, JsonSyntaxException {
        StringBuilder stringBuilder;
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            JsonElement parse = Streams.parse(jsonReader);
            jsonReader.setLenient(isLenient);
            return parse;
        } catch (StackOverflowError e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed parsing JSON source: ");
            stringBuilder.append(jsonReader);
            stringBuilder.append(" to Json");
            throw new JsonParseException(stringBuilder.toString(), e);
        } catch (OutOfMemoryError e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed parsing JSON source: ");
            stringBuilder.append(jsonReader);
            stringBuilder.append(" to Json");
            throw new JsonParseException(stringBuilder.toString(), e2);
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
        }
    }

    public JsonElement parse(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            JsonElement parse = parse(jsonReader);
            if (parse.isJsonNull() || jsonReader.peek() == JsonToken.END_DOCUMENT) {
                return parse;
            }
            throw new JsonSyntaxException("Did not consume the entire document.");
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        } catch (NumberFormatException e22) {
            throw new JsonSyntaxException(e22);
        }
    }

    public JsonElement parse(String str) throws JsonSyntaxException {
        return parse(new StringReader(str));
    }
}
