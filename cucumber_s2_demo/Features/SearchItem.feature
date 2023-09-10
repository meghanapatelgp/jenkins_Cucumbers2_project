 Feature: Add Book to Cart
 Scenario: User searches for a book named "Fiction" and adds it to the cart
 Given User navigates to the website
 When User clicks on the "Books" link
 And User enters "Fiction" into the search field
 And User clicks the "Search" button
 And User selects the first search result
 And User clicks on the "Add to Cart" button
Then User close the browser