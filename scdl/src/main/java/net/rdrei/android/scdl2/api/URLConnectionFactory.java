package net.rdrei.android.scdl2.api;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public interface URLConnectionFactory {
	URLConnection create(URL url) throws IOException;
}
