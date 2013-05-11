package com.sjl.dsl4xml.json;

public interface NamedArray<T> extends Content<T> {

    /**
     * Specify a simple property type for this array. This is a shortcut for of(UnNamedProperty(aConvertableType))
     *
     * @param aConvertableType a class for which a (String->ConvertableType) converter is registered.
     *
     * @return this
     */
    public NamedArray<T> of(Class<?> aConvertableType);

    public NamedArray<T> of(UnNamedProperty<?> aContent);

    public NamedArray<T> of(UnNamedObject<?> aContent);

    public NamedArray<T> of(UnNamedArray<?> aContent);

}