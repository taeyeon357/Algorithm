import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int min = Math.min(input[0].length(), input[1].length());
        int max = Math.max(input[0].length(), input[1].length());

        StringBuilder sb = new StringBuilder();
       
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for(int i=0; i<input[0].length(); i++){
            left.add(input[0].charAt(i));
        }
        for(int i=0; i<input[1].length(); i++){
            right.add(input[1].charAt(i));
        }

        int check = 0;
        while(!left.empty() && !right.empty()){
            char l = left.pop();
            char r = right.pop();
            if(l == r && l == '0'){
                if(check == 0){
                    sb.append(0);
                }else{
                    sb.append(1);
                }
                check = 0;
            }else if(l == r && l == '1'){
                if(check == 0){
                    sb.append(0);
                }else{
                    sb.append(1);
                }
                check = 1;
            }else{
                if(check == 0){
                    sb.append(1);
                    check = 0;
                }else{
                    sb.append(0);
                    check = 1;
                }
            }
        }

        if(!left.empty()){
            while(!left.empty()){
                char top = left.pop();
                if(top == '0'){
                    if(check == 0){
                        sb.append(0);
                        check = 0;
                    }else{
                        sb.append(1);
                        check = 0;
                    }
                }else{
                    if(check == 1){
                        sb.append(0);
                        check = 1;
                    }else{
                        sb.append(1);
                        check = 0;
                    }
                }
            }
        }else if(!right.empty()){
            while(!right.empty()){
                char top = right.pop();
                if(top == '0'){
                    if(check == 0){
                        sb.append(0);
                        check = 0;
                    }else{
                        sb.append(1);
                        check = 0;
                    }
                }else{
                    if(check == 1){
                        sb.append(0);
                        check = 1;
                    }else{
                        sb.append(1);
                        check = 0;
                    }
                }
            }
        }

        String result = sb.reverse().toString();;
        if(check == 1){
            sb.reverse().append(1);
            result = sb.reverse().toString();
        }
        while(sb.toString().charAt(0) == '0' && sb.length() > 1){
            sb.deleteCharAt(0);
            result = sb.toString();
        }
        System.out.println(result);

    } 
}