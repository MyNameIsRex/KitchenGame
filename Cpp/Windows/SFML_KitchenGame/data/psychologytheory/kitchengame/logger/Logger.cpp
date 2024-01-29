#include "Logger.hpp"

void Logger::LogInfo(string message)
{
	cout << "[Info] " << message << endl;
}

void Logger::LogWarning(string message)
{
	cout << "[Warning] " << message << endl;
}

void Logger::LogError(string message)
{
	cout << "[Error] " << message << endl;
}