package cloud.projetS5.model;

import java.security.MessageDigest;
import java.sql.Timestamp;

public class BearerToken {

    public static Token generateToken() throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        int seconds = (int) (currentTimeMillis / 1000);
        Timestamp now = new Timestamp(seconds);

        long updatedTimeMillis = (long) now.getTime() * 1000 + 3600000;
        int updatedSeconds = (int) (updatedTimeMillis / 1000);
        Timestamp expiration = new Timestamp(updatedSeconds);

        String base = now.toString() + "huhu" + expiration.toString();
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = sha256.digest(base.getBytes());

            StringBuilder tok = new StringBuilder();
            for (byte b : hashBytes) {
                tok.append(String.format("%02x", b));
            }

            String token = tok.toString();

            return new Token(token, expiration, now, true);
        } catch (Exception e) {
            throw e;
        }
    }

}
