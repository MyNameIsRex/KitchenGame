#include <iostream>

using namespace std;

class AbstractGameState
{
	int mStateId;
	string mName;

public:
	AbstractGameState(int stateId, string name);

	virtual void UpdateGameState() = 0;

	virtual void RenderGameState() = 0;

	int GetStateId()
	{
		return this->mStateId;
	}

	void SetStateId(int stateId)
	{
		this->mStateId = stateId;
	}

	string GetName()
	{
		return this->mName;
	}

	void SetName(string name)
	{
		this->mName = name;
	}
};