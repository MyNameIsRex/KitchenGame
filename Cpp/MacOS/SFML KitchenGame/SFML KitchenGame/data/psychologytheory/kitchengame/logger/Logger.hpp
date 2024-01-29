//
//  Logger.hpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/28.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#ifndef LOGGER
#define LOGGER

#include <iostream>

using namespace std;

class Logger
{
public:
    static void LogInfo(string message);
    
    static void LogWarning(string message);
    
    static void LogError(string message);
};

#endif
