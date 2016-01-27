/**
 * Copyright 2015-2016 Knowm Inc. (http://knowm.org) and contributors.
 * Copyright 2011-2015 Xeiam LLC (http://xeiam.com) and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.knowm.xchart;

import org.knowm.xchart.internal.ChartBuilder;

/**
 * @author timmolter
 */
public class ChartBuilder_Pie extends ChartBuilder<ChartBuilder_Pie, Chart_Pie> {

  public ChartBuilder_Pie() {

  }

  /**
   * return fully built ChartPie
   *
   * @return a ChartPie
   */
  @Override
  public Chart_Pie build() {

    return new Chart_Pie(this);
  }
}