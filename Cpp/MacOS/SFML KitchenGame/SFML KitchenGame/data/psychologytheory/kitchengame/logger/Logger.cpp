//
//  Logger.cpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/28.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#include "Logger.hpp"

void Logger::LogInfo(const char* message)
{
    cout << "[Info] " << message << endl;
}

void Logger::LogWarning(const char* message)
{
    cout << "[Warning] " << message << endl;
}

void Logger::LogError(const char* message)
{
    cout << "[Error] " << message << endl;
}
