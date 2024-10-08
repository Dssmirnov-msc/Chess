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
public class Chess {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Params.handle_input(args);
        
        MatrixDesk desk1 = new MatrixDesk();
        ColumnDesk desk2 = new ColumnDesk();
        
        desk1.drawLetterDesk();
        System.out.println("");
        desk1.drawNumDesk();
        System.out.println("");
        
        System.out.println("Периметр Матричной доски: " + desk1.calcPerimetr());
        System.out.println("След главной диагонали: " + desk1.calcMainDiag());
        System.out.println("След побочной диагонали: " + desk1.calcBackDiag());
        
        desk2.drawLetterDesk();
        System.out.println("");
        desk2.drawNumDesk();
        System.out.println("");
        
        System.out.println("Периметр Зеркальной доски: " + desk2.calcPerimetr());
        System.out.println("След главной диагонали: " + desk2.calcMainDiag());
        System.out.println("След побочной диагонали: " + desk2.calcBackDiag());
    }
    
}
