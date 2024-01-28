//
//  AbstractGameState.hpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/28.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#ifndef AbstractGameState_hpp
#define AbstractGameState_hpp

#include <iostream>

#endif /* AbstractGameState_hpp */

class AbstractGameState
{
    const char* mName;
    
public:
    AbstractGameState(const char* name);
    
    virtual void InitializeGameState() = 0;
    
    virtual void UpdateGameState() = 0;
    
    virtual void RenderGameState() = 0;
    
    const char* getName()
    {
        return this -> mName;
    }
};
