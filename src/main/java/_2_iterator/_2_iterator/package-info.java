/**
 * Le but d'un itérateur est de permettre à son utilisateur de parcourir le conteneur
 * c'est-à-dire d'accéder séquentiellement à tous ses éléments pour leur appliquer un traitement
 * tout en isolant l'utilisateur de la structure interne du conteneur, potentiellement complexe.
 * Ainsi, le conteneur peut stocker les éléments de la façon qu'il veut,
 * tout en permettant à l'utilisateur de le traiter comme une simple liste.
 * Le plus souvent l'itérateur est conçu en même temps que la classe-conteneur qu'il devra parcourir,
 * et ce sera le conteneur lui-même qui créera et distribuera les itérateurs pour accéder à ses éléments.
 */
package _2_iterator._2_iterator;