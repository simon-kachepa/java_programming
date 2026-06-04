public class TelephoneKeyboard {
    public static void main(String[] args){
        char[][] keys = {{'1', '2', '3'},
                         {'4', '5', '6'},
                         {'7', '8', '9'},
                         {'*', '0', '&'}
                        };

        // for (char[] row : keys){
        //     for(char key: row){
        //         System.out.println(key + " ");
        //     }
        // }

        for (int row = 0; row < keys.length; row++){
            for (int key = 0; key < keys[row].length; key++){
                System.out.print(keys[row][key] + " ");
            }
            System.out.println();
        }
    }
}
