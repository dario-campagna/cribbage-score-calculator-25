# Behaviors

- Interpret/parse the string representation of a Cribbage Hand
- Compute the score a Cribbage Hands
  - Fifteen twos
    - Find all the possible combinations of cards
  - Runs
  - Pairs
  - Flush
- Print the score
- Rank
  - Numeric value associated and used for the fifteen twos
  - Order
  - Distinct values to be used for pairs

# Tests

- ~~"3♥" -> Card with suite Hearts~~
- ~~"3♥" -> Card with rank 3~~
- ~~"0♥" -> Card with rank 10~~
- "J♥" -> Card with rank Jack and suite Hearts
- "5♣" -> Card with rank 5 and suite Clubs
- "6♦" -> Card with rank 6 and suite Diamonds
- "A♠" -> Card with rank Ace and suite Spades
- ~~"5♥5♦5♠5♣7♣" -> Cribbage Hand with Hand Cards ... and Starter Card Seven of Clubs~~
  - ~~"5♥5♦5♠5♣7♣" -> Starter Card is Seven of Clubs~~
  - ~~"5♥5♦5♠5♣7♣" -> Hand Cards are Five of each suite~~
- Flush
  - ~~"3♣7♣A♣K♣J♦" -> 4 points~~
  - ~~"3♣7♣A♣K♣J♣" -> 5 points~~
  - ~~"J♣7♥A♣K♦3♣" -> 1 points (one for his nob)~~
- Pairs
  - "5♥5♦A♠2♣6♣" -> 2
  - "A♥A♦A♠2♣6♣" -> 6
  - "Q♥Q♦Q♠Q♣6♠" -> 12