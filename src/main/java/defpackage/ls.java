package defpackage;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

/* renamed from: ls */
public class ls {
    static boolean ad = false;
    public static final int ak = 9;
    static final float al = 30.0f;
    static Hashtable ar = new Hashtable(16);

    ls() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ls.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static File ae(String str) {
        RandomAccessFile randomAccessFile;
        if (ad) {
            File file = (File) ar.get(str);
            if (file == null) {
                file = new File(am.aq, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            ar.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                        }
                    } else {
                        throw new RuntimeException("");
                    }
                } catch (Exception e2) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception e3) {
                        }
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }

    static File ai(String str) {
        RandomAccessFile randomAccessFile;
        if (ad) {
            File file = (File) ar.get(str);
            if (file == null) {
                file = new File(am.aq, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            ar.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                        }
                    } else {
                        throw new RuntimeException("");
                    }
                } catch (Exception e2) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception e3) {
                        }
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }

    static File aj(String str) {
        RandomAccessFile randomAccessFile;
        if (ad) {
            File file = (File) ar.get(str);
            if (file == null) {
                file = new File(am.aq, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            ar.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                        }
                    } else {
                        throw new RuntimeException("");
                    }
                } catch (Exception e2) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception e3) {
                        }
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }

    static File al(String str) {
        RandomAccessFile randomAccessFile;
        if (ad) {
            File file = (File) ar.get(str);
            if (file == null) {
                file = new File(am.aq, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            ar.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                        }
                    } else {
                        throw new RuntimeException("");
                    }
                } catch (Exception e2) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception e3) {
                        }
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }

    static File ar(String str) {
        RandomAccessFile randomAccessFile;
        if (ad) {
            File file = (File) ar.get(str);
            if (file == null) {
                file = new File(am.aq, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            ar.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                        }
                    } else {
                        throw new RuntimeException("");
                    }
                } catch (Exception e2) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception e3) {
                        }
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }
}
