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
public class MatrixDesk extends AbstractDesk{
    private Cell[][] matrix;
    
    
    public MatrixDesk() {
        super();
    }

    @Override
    void form_desk() {
        int deskSize = Params.getDeskSize();
        
        int cellValue;
        boolean isEven; 
        for (int i = 0; i < deskSize; i++) {
            for (int j = 0; j < deskSize; j++) {
                cellValue = (i)*deskSize + (j+1);
                isEven = (i + j) % 2 == 0;
                matrix[i][j] = new Cell(cellValue, isEven);
            }
        }
    }

    @Override
    void draw_desk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
