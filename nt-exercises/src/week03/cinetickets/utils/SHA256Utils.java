//package week03.cinetickets.utils;
//
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//
//public class SHA256Utils {
//
//    public static String hashPassword(String password) {
//        try {
//            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
//            byte[] hashBytes = messageDigest.digest(password.getBytes());
//
//            StringBuilder hexString = new StringBuilder();
//            for (byte hashByte : hashBytes) {
//                String hex = Integer.toHexString(0xff & hashByte);
//                if (hex.length() == 1) {
//                    hexString.append('0');
//                }
//                hexString.append(hex);
//            }
//
//            return hexString.toString();
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public static void main(String[] args) {
//        String password = "user123"; // Senha do usuário
//        String hashedPassword = hashPassword(password);
//
//        System.out.println("Senha: " + password);
//        System.out.println("Senha Criptografada: " + hashedPassword);
//    }
//}
//
