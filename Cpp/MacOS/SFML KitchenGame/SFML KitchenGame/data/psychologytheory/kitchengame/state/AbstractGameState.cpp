//
//  AbstractGameState.cpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/29.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#include "AbstractGameState.hpp"

AbstractGameState::AbstractGameState(int stateId, string name)
{
    this->mStateId = stateId;
    this->mName = name;
}
