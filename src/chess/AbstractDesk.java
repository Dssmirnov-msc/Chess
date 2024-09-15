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
public abstract class AbstractDesk {
    protected int letterFont;
    protected int numFont;
    public int size;
    public AbstractDesk( ){
        size = Params.getDeskSize();
        formDesk();
    } 
    
    abstract void formDesk();
    public void drawLetterDesk(){
        drawLetterHeader();
        drawLetterBody();
    };
    public void drawNumDesk(){
        drawNumHeader();
        drawNumBody();
    };
    protected int calcCellNum(int i, int j){
        int n = (i)*size + (j+1);
        return n;
    }

    private void drawLetterHeader() {
        letterFont = String.valueOf(size).length();
        drawHeader(letterFont);
    }
    private void drawNumHeader() {
        numFont = String.valueOf(size*size).length();
        drawHeader(numFont);
    }
    private void drawHeader(int font){
        String header = "| ";
        for (int i = 0; i < font; i++) {
            header = header + " ";
        }
        header = header + " |";
        for (int i = 0; i < size; i++) {
            header = header + " " + space(i,font) + " " + "|";
        }
        System.out.println(header);
    }
    
    protected <T> String space(T Val, int range){
        String S = String.valueOf(Val);
        if (S.length() - range <0){
            for (int i = 0; range - S.length() > 0; i++) {
                S = S + " ";
            }
        }
        return S;
    }
    protected abstract void drawLetterBody();
    protected abstract void drawNumBody();

    
}
