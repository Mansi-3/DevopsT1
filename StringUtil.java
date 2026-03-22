public class StringUtil {
 public String reverse(String str){
    if(str == null){
        throw new NullPointerException("Input is null");
    }
    return new StringBuilder(str).reverse().toString();
 }    
}
