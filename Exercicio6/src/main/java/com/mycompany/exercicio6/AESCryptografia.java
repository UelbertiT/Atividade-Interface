package com.mycompany.exercicio6;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/**
 *
 * @author aluno
 */
public class AESCryptografia implements Criptografavel {
    @Override
    public byte[] criptografar(String dados) {
        String chaveencriptacao = "39ifiwje93r23rr";
        String IV = "uehseushhdbd";
        
        Cipher encripta = null;
        try {
            encripta = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        SecretKeySpec key = null;
        try {
            key = new SecretKeySpec(chaveencriptacao.getBytes("UTF-8"), "AES");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            encripta.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | InvalidKeyException | InvalidAlgorithmParameterException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return encripta.doFinal(dados.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String descriptrografar(byte[] dadosCriptografados) {
        String chaveencriptacao = "39ifiwje93r23rr";
        String IV = "uehseushhdbd";
        
        Cipher decripta = null;
        try {
            decripta = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        SecretKeySpec key = null;
        try {
            key = new SecretKeySpec(chaveencriptacao.getBytes("UTF-8"), "AES");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            decripta.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | InvalidKeyException | InvalidAlgorithmParameterException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return new String(decripta.doFinal(dadosCriptografados),"UTF-8");
        } catch (IllegalBlockSizeException | BadPaddingException | UnsupportedEncodingException ex) {
            Logger.getLogger(AESCryptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
