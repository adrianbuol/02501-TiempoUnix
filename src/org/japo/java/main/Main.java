/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
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
package org.japo.java.main;

import java.util.Date;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */

/*Tiempo existente entre las 00:00:00 del dia 01/01/1970 UTC y la hora/fecha
del sistema en milisegundos Tiempo UNIX .........: <tiempo>
"Date <tiempo> = new Date();" - Clase
"Sout("..."+fecha.getTime()+"."); - fecha.getTime() recoge la cantidad de 
milisegundos desde 01/01/1970 (tiempo UNIX) a las 00:00:00 hasta ahora.
*/
public class Main {
       public static void main(String[] args){
           long fecha = new Date().getTime();
           System.out.printf("Tiempo UNIX .........:%d%n", fecha);
       }

}
