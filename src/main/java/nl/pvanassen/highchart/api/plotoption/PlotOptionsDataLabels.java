package nl.pvanassen.highchart.api.plotoption;

import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.base.Style;

public class PlotOptionsDataLabels extends BaseObject {

    private String align = null;
    
    private String backgroundColor = null;
            
    private String borderColor = null;
    
    private Integer borderRadius = null;
    
    private Integer borderWidth = null;
    
    private String color = null;
    
    private Boolean crop = null;
    
    private Boolean defer = null;

    private Boolean enabled = null;
    
    private String format = null;

    private Object formatter = null;
    
    private Boolean inside = null;
    
    private String overflow = null;
    
    private Integer padding = null;
            
    private Double rotation = null;
    
    private Boolean shadow = null;
    
    private Style style = null;
    
    private Boolean useHTML = null;
    
    private String verticalAlign = null;
    
    private Integer x = null;
    
    private Integer y = null;
    
    private Integer zIndex = null;

    /**
     * @return the align
     */
    public String getAlign() {
        return align;
    }

    /**
     * @param align the align to set
     * @return 
     */
    public PlotOptionsDataLabels setAlign(String align) {
        this.align = align;
        return this;
    }

    /**
     * @return the backgroundColor
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param backgroundColor the backgroundColor to set
     * @return 
     */
    public PlotOptionsDataLabels setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * @return the borderColor
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * @param borderColor the borderColor to set
     * @return 
     */
    public PlotOptionsDataLabels setBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * @return the borderRadius
     */
    public Integer getBorderRadius() {
        return borderRadius;
    }

    /**
     * @param borderRadius the borderRadius to set
     * @return 
     */
    public PlotOptionsDataLabels setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    /**
     * @return the borderWidth
     */
    public Integer getBorderWidth() {
        return borderWidth;
    }

    /**
     * @param borderWidth the borderWidth to set
     * @return 
     */
    public PlotOptionsDataLabels setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     * @return 
     */
    public PlotOptionsDataLabels setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * @return the crop
     */
    public Boolean getCrop() {
        return crop;
    }

    /**
     * @param crop the crop to set
     * @return 
     */
    public PlotOptionsDataLabels setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }

    /**
     * @return the defer
     */
    public Boolean getDefer() {
        return defer;
    }

    /**
     * @param defer the defer to set
     * @return 
     */
    public PlotOptionsDataLabels setDefer(Boolean defer) {
        this.defer = defer;
        return this;
    }

    /**
     * @return the enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param enabled the enabled to set
     * @return 
     */
    public PlotOptionsDataLabels setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     * @return 
     */
    public PlotOptionsDataLabels setFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * @return the formatter
     */
    public Object getFormatter() {
        return formatter;
    }

    /**
     * @param formatter the formatter to set
     * @return 
     */
    public PlotOptionsDataLabels setFormatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    /**
     * @return the inside
     */
    public Boolean getInside() {
        return inside;
    }

    /**
     * @param inside the inside to set
     * @return 
     */
    public PlotOptionsDataLabels setInside(Boolean inside) {
        this.inside = inside;
        return this;
    }

    /**
     * @return the overflow
     */
    public String getOverflow() {
        return overflow;
    }

    /**
     * @param overflow the overflow to set
     * @return 
     */
    public PlotOptionsDataLabels setOverflow(String overflow) {
        this.overflow = overflow;
        return this;
    }

    /**
     * @return the padding
     */
    public Integer getPadding() {
        return padding;
    }

    /**
     * @param padding the padding to set
     * @return 
     */
    public PlotOptionsDataLabels setPadding(Integer padding) {
        this.padding = padding;
        return this;
    }

    /**
     * @return the rotation
     */
    public Double getRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     * @return 
     */
    public PlotOptionsDataLabels setRotation(Double rotation) {
        this.rotation = rotation;
        return this;
    }

    /**
     * @return the shadow
     */
    public Boolean getShadow() {
        return shadow;
    }

    /**
     * @param shadow the shadow to set
     * @return 
     */
    public PlotOptionsDataLabels setShadow(Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    /**
     * @return the style
     */
    public Style getStyle() {
        if(this.style == null) {
            this.style = new Style();
        }
        return style;
    }

    /**
     * @return the useHTML
     */
    public Boolean getUseHTML() {
        return useHTML;
    }

    /**
     * @param useHTML the useHTML to set
     * @return 
     */
    public PlotOptionsDataLabels setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    /**
     * @return the verticalAlign
     */
    public String getVerticalAlign() {
        return verticalAlign;
    }

    /**
     * @param verticalAlign the verticalAlign to set
     * @return 
     */
    public PlotOptionsDataLabels setVerticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    /**
     * @return the x
     */
    public Integer getX() {
        return x;
    }

    /**
     * @param x the x to set
     * @return 
     */
    public PlotOptionsDataLabels setX(Integer x) {
        this.x = x;
        return this;
    }

    /**
     * @return the y
     */
    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     * @return 
     */
    public PlotOptionsDataLabels setY(Integer y) {
        this.y = y;
        return this;
    }

    /**
     * @return the zIndex
     */
    public Integer getzIndex() {
        return zIndex;
    }

    /**
     * @param zIndex the zIndex to set
     * @return 
     */
    public PlotOptionsDataLabels setzIndex(Integer zIndex) {
        this.zIndex = zIndex;
        return this;
    }


}