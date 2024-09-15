/*
 * Copyright 2024 Dmitry.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package chess;

/**
 *
 * @author Dmitry
 */
public class Params {
    
    private int deskSize;
    private boolean useRandomCellValue;
    static private Params params;
    
    private Params(int deskSize, boolean use_random_cell_value) {
        this.deskSize = deskSize;
        this.useRandomCellValue = use_random_cell_value;
    }
    
    
    
    public static void handle_input(String[] args) throws Exception{
        int desk_size;
        boolean use;
        if (args.length > 0) {
            if (args.length > 2) {
                throw new Exception("Слишком много входных аргументов");
            } else{
                desk_size = Integer.valueOf(args[0]);
                if (args.length == 2) 
                    use = Boolean.parseBoolean(args[1]); 
                else 
                    use = false;
            }
        } else {
            System.out.println("Нет входных аргументов. Размер доски по умолчанию 8 x 8, значение ячейки заполняется по ее номеру");
            desk_size = 8;
            use = false;
        }
        params = new Params(desk_size, use);
    }

    static public int getDeskSize() {
        return params.deskSize;
    }

    static public boolean isUseRandomCellValue() {
        return params.useRandomCellValue;
    }
    
    
}
