# Book Finder Application

System to find names of books from Goodreads based on trivia, plot, movie adaptation, author, awards. The system is 
designed using Google Search API results, with custom filtering criteria.

## Pre-Requisite
User needs to create a Custom Search Engine using Google's Custom Search Engine Control Panel.
Update your API_KEY and Custom Search Engine details under
```/main/resources/application-config.yml``` 
#### More Info on Custom Search
https://developers.google.com/custom-search/docs/overview

###Set up
 * Clone the repository.
 * Create developer account and custom search engine. ( _This has been designed and tested using an engine to find results from goodreads.com_ )
 * Build project :  ```mvn clean install```
 * Run Program : ```mvn exec:java "-Dapi.q=<your_custom_query_string>"```
 
 