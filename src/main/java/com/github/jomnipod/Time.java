/*
 * Copyright (c) 2017 Mattias Eklöf <mattias.eklof@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */
package com.github.jomnipod;

import java.time.LocalTime;

public class Time implements Comparable<Time> {

	private Integer hours;

	private Integer minutes;

	private Integer seconds;

	public Time(Integer seconds, Integer minutes, Integer hours) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":"
				+ String.format("%02d", seconds);
	}

	@Override
	public int compareTo(Time other) {
		if (!hours.equals(other.hours)) {
			return hours.compareTo(other.hours);
		}
		if (!minutes.equals(other.minutes)) {
			return minutes.compareTo(other.minutes);
		}
		return seconds.compareTo(other.seconds);
	}

	public LocalTime toLocalTime() {
		return LocalTime.of(hours, minutes, seconds);
	}

}
