package android.support.v4.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;

class DatagramSocketWrapper extends Socket {

    private static class DatagramSocketImplWrapper extends SocketImpl {
        DatagramSocketImplWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
            this.localport = datagramSocket.getLocalPort();
            this.fd = fileDescriptor;
        }

        /* Access modifiers changed, original: protected */
        public void accept(SocketImpl socketImpl) throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public int available() throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void bind(InetAddress inetAddress, int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void close() throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void connect(String str, int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void connect(InetAddress inetAddress, int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void connect(SocketAddress socketAddress, int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void create(boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public InputStream getInputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        public Object getOption(int i) throws SocketException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public OutputStream getOutputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void listen(int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void sendUrgentData(int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        public void setOption(int i, Object obj) throws SocketException {
            throw new UnsupportedOperationException();
        }
    }

    DatagramSocketWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) throws SocketException {
        super(new DatagramSocketImplWrapper(datagramSocket, fileDescriptor));
    }
}
