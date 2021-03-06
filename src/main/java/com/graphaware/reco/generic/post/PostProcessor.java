/*
 * Copyright (c) 2015 GraphAware
 *
 * This file is part of GraphAware.
 *
 * GraphAware is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.reco.generic.post;

import com.graphaware.reco.generic.result.Recommendations;

/**
 * Recommendations post processor. Intended for boosting or penalizing scores of certain recommendations. For example,
 * you could boost the score of a recommended match on a dating site if the smoker/non-smoker preference of the
 * recommended person matches the preference of the person looking for recommendation.
 */
public interface PostProcessor<OUT, IN> {

    /**
     * Post-process results.
     *
     * @param recommendations scored recommendations.
     * @param input           for whom the recommendation have been produced, must not be <code>null</code>.
     */
    void postProcess(Recommendations<OUT> recommendations, IN input);
}
