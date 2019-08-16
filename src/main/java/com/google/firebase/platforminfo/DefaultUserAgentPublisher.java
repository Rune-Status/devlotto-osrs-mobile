package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import java.util.Iterator;
import java.util.Set;

public class DefaultUserAgentPublisher implements UserAgentPublisher {
    private final GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final String javaSDKVersionUserAgent;

    DefaultUserAgentPublisher(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.javaSDKVersionUserAgent = toUserAgent(set);
        this.gamesSDKRegistrar = globalLibraryVersionRegistrar;
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf(LibraryVersion.class)).factory(DefaultUserAgentPublisher$$Lambda$1.lambdaFactory$()).build();
    }

    private static String toUserAgent(Set<LibraryVersion> set) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion libraryVersion = (LibraryVersion) it.next();
            stringBuilder.append(libraryVersion.getLibraryName());
            stringBuilder.append('/');
            stringBuilder.append(libraryVersion.getVersion());
            if (it.hasNext()) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }

    public String getUserAgent() {
        if (this.gamesSDKRegistrar.getRegisteredVersions().isEmpty()) {
            return this.javaSDKVersionUserAgent;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.javaSDKVersionUserAgent);
        stringBuilder.append(' ');
        stringBuilder.append(toUserAgent(this.gamesSDKRegistrar.getRegisteredVersions()));
        return stringBuilder.toString();
    }
}
