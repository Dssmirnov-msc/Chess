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
public class Column {
    private Cell[] cells; 

    public Column() {
        init();
    }

    public void addCell(Cell cell, int j) {
        cells[j] = cell;
    }

    private void init() {
        cells = new Cell[Params.getDeskSize()];
    }

    public Cell getCell(int j) {
        return cells[j];
    }

    public int calcLength() {
        int L = 0;
        for (Cell cell : cells) {
            L = L + cell.getValue();
        }
        return L;
    }
}
