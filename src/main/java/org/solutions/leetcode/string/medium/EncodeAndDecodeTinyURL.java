package org.solutions.leetcode.string.medium;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Arti Harde
 */
public class EncodeAndDecodeTinyURL {

    public static void main(String[] args) {
        EncodeAndDecodeTinyURL encodeAndDecodeTinyURL = new EncodeAndDecodeTinyURL();
        String url = "https://leetcode.com/problems/design-tinyurl";
        String encodedUrl = encodeAndDecodeTinyURL.encode(url);
        System.out.println("encodedUrl : " + encodedUrl);
        String decodedUrl = encodeAndDecodeTinyURL.decode(encodedUrl);
        System.out.println("decodedUrl : " + decodedUrl);
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        return Base64.getUrlEncoder().encodeToString(longUrl.getBytes(StandardCharsets.UTF_8));
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return new String( Base64.getUrlDecoder().decode(shortUrl.getBytes(StandardCharsets.UTF_8)));
    }
}