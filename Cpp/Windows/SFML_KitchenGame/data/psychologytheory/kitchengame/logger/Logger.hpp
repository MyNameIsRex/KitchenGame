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