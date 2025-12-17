// xor class
public class Xor extends Cipher {
   public Xor() {
   }

   public String encode(String var1) {
      String var2 = "";

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = (char)(var1.charAt(var3) ^ this.mykey.charAt(var3 % this.mykey.length()));
         var2 = var2 + String.format("%02X", Integer.valueOf(var4));
      }

      return var2;
   }

   public String decode(String var1) {
      String var2 = "";

      for(int var3 = 0; var3 < var1.length(); var3 += 2) {
         int var4 = Integer.parseInt(var1.substring(var3, var3 + 2), 16);
         char var5 = (char)(var4 ^ this.mykey.charAt(var3 / 2 % this.mykey.length()));
         var2 = var2 + var5;
      }

      return var2;
   }
}
