## In this session we will explore selecting elements using CSS Selectors.

We will be using the below website for this tutorial.

https://www.enterprise.com/en/home.html

### Using ID:

#### General syntax to select elements using CSS elements.

```
tag[attribute='value']
```
Example:  

**Approach 1:**
```
input[id='pickupLocationTextBox]
```

#### To Select an element using its id we should use /#.
```
# -> Id
```

**Approach 2:**

```
#pickupLocationTextBox
```

**Approach 3:**

```
input#pickupLocationTextBox
```

### Using Class:


**Approach 1:**

```
input[class='location-input location-field selected']
```

#### To Select an element using its id we should use /#.

```
. -> class

```

**Approach 2:**

```
.location-input
```

**Approach 3:**

```
input.location-input
```

#### Chaining Classes:

```
.location-input.location-field.selected
```
