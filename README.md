# simple-webcrawler
This is a simple web crawler which can crawl a root site traversing all 'a href' tags inside it

# Build/Run 
Requirements - 
1. You need Java Runtime environment and Maven installed on your system
2. An IDE - Eclipse or IntelliJ (optional)

# Limitations
1. The program takes a long time to run for a single root URL
2. Cannot handle Single Page Applications (SPA's) where the URL's can be dynamic and generated as a response from within the application.

# Future Steps
Basic -
1. Junits
2. Add Logger framework
3. Enhance output to store in tree-structure instead of the current flat maps.
3. Build plugin instead of a standalone Java program

Next Level -
1. Target SPA as currently it can only work for simple HTML web applications and not for SPA where the link may be transimitted through a response. This will need a rendering mechanism to wait and analyze AJAX calls.
2. Add schedulling capabilities so that we can have latest data in-hand. The scheduller should atleast run daily.
3. Performance Improvement - Currently the program runs for a long time as it traverses all pages and all pages inside it and so on. Threading can be explored in this area
