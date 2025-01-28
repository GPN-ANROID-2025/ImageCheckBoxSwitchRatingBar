## Day 7 : Android Widgets and Layouts

### Widgets
- **ImageView**:  
  Displays an image resource. It can handle images from the drawable folder or external sources like URLs. Common attributes include:  
  - `android:src`: Specifies the image source.  
  - `android:scaleType`: Defines how the image fits in the view.

- **CheckBox**:  
  A two-state button that can be checked or unchecked. Useful for multi-select options. Key attributes:  
  - `android:checked`: Sets the initial state (true/false).  
  - `android:text`: Displays a label beside the checkbox.

- **Switch**:  
  A modern toggle switch to select between two states (on/off). Commonly used for settings. Key attributes:  
  - `android:textOn`: Label for the "on" state.  
  - `android:textOff`: Label for the "off" state.  
  - `android:checked`: Sets the initial state.

- **RatingBar**:  
  A widget for selecting and displaying ratings using stars. Attributes include:  
  - `android:numStars`: Number of stars to display.  
  - `android:rating`: Default rating value.  
  - `android:stepSize`: Increments for rating (e.g., 0.5, 1).

### Layouts
- **RelativeLayout**:  
  A versatile view group where child views are positioned relative to the parent or other child views. Key attributes for alignment:  
  - `android:layout_alignParentTop`: Aligns the view to the top of the parent.  
  - `android:layout_toRightOf`: Places the view to the right of another view.

- **ScrollView**:  
  A layout that enables vertical scrolling for its child views. It can host a single child layout, typically a vertical `LinearLayout`. Common attributes:  
  - `android:fillViewport`: Ensures the ScrollView expands to match its parent size.  
  - `android:scrollbars`: Toggles visibility of scrollbars (vertical/horizontal).
