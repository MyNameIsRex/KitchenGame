#pragma once
#include <iostream>
#include <string>

#include <SFML/Graphics.hpp>

class Game
{
	int width;
	int height;
	std::string title;

	sf::RenderWindow window;
	sf::CircleShape shape;
	sf::Event event;

public:
	Game(int width, int height, std::string title);

	void Initialize();

	void Run();

	void Update(sf::Event event);

	void Render();
};
