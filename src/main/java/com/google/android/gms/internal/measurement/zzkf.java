package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

final class zzkf extends SSLSocket {
    private final SSLSocket zzatc;

    zzkf(zzke zzke, SSLSocket sSLSocket) {
        this.zzatc = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.zzatc.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        this.zzatc.bind(socketAddress);
    }

    public final void close() throws IOException {
        synchronized (this) {
            this.zzatc.close();
        }
    }

    public final void connect(SocketAddress socketAddress) throws IOException {
        this.zzatc.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.zzatc.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.zzatc.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.zzatc.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.zzatc.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.zzatc.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.zzatc.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.zzatc.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.zzatc.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.zzatc.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.zzatc.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.zzatc.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.zzatc.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.zzatc.getNeedClientAuth();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.zzatc.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.zzatc.getOutputStream();
    }

    public final int getPort() {
        return this.zzatc.getPort();
    }

    public final int getReceiveBufferSize() throws SocketException {
        int receiveBufferSize;
        synchronized (this) {
            receiveBufferSize = this.zzatc.getReceiveBufferSize();
        }
        return receiveBufferSize;
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.zzatc.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.zzatc.getReuseAddress();
    }

    public final int getSendBufferSize() throws SocketException {
        int sendBufferSize;
        synchronized (this) {
            sendBufferSize = this.zzatc.getSendBufferSize();
        }
        return sendBufferSize;
    }

    public final SSLSession getSession() {
        return this.zzatc.getSession();
    }

    public final int getSoLinger() throws SocketException {
        return this.zzatc.getSoLinger();
    }

    public final int getSoTimeout() throws SocketException {
        int soTimeout;
        synchronized (this) {
            soTimeout = this.zzatc.getSoTimeout();
        }
        return soTimeout;
    }

    public final String[] getSupportedCipherSuites() {
        return this.zzatc.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.zzatc.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.zzatc.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.zzatc.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.zzatc.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.zzatc.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.zzatc.isBound();
    }

    public final boolean isClosed() {
        return this.zzatc.isClosed();
    }

    public final boolean isConnected() {
        return this.zzatc.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.zzatc.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.zzatc.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.zzatc.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) throws IOException {
        this.zzatc.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.zzatc.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.zzatc.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.zzatc.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.zzatc.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) throws SocketException {
        this.zzatc.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.zzatc.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) throws SocketException {
        this.zzatc.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.zzatc.setPerformancePreferences(i, i2, i3);
    }

    public final void setReceiveBufferSize(int i) throws SocketException {
        synchronized (this) {
            this.zzatc.setReceiveBufferSize(i);
        }
    }

    public final void setReuseAddress(boolean z) throws SocketException {
        this.zzatc.setReuseAddress(z);
    }

    public final void setSendBufferSize(int i) throws SocketException {
        synchronized (this) {
            this.zzatc.setSendBufferSize(i);
        }
    }

    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.zzatc.setSoLinger(z, i);
    }

    public final void setSoTimeout(int i) throws SocketException {
        synchronized (this) {
            this.zzatc.setSoTimeout(i);
        }
    }

    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.zzatc.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) throws SocketException {
        this.zzatc.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.zzatc.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.zzatc.setWantClientAuth(z);
    }

    public final void shutdownInput() throws IOException {
        this.zzatc.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.zzatc.shutdownOutput();
    }

    public final void startHandshake() throws IOException {
        this.zzatc.startHandshake();
    }

    public final String toString() {
        return this.zzatc.toString();
    }
}
