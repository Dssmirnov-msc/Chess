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
    
    public AbstractDesk(int desk_size){
        form_desk(desk_size);
    } 
    
    abstract void form_desk(int desk_size);
    abstract void draw_desk();
}
