.class public final Lcom/google/crypto/tink/shaded/protobuf/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/e0;
    .locals 2

    .line 1
    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/v;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 4
    .line 5
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/e0;->f:Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/e0;->c()Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 14
    .line 15
    :cond_0
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static b(Ljava/lang/Object;LF0/y;)Z
    .locals 8

    .line 1
    iget v0, p1, LF0/y;->b:I

    .line 2
    .line 3
    ushr-int/lit8 v1, v0, 0x3

    .line 4
    .line 5
    and-int/lit8 v0, v0, 0x7

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x3

    .line 10
    iget-object v5, p1, LF0/y;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v5, LW5/d;

    .line 13
    .line 14
    if-eqz v0, :cond_8

    .line 15
    .line 16
    if-eq v0, v3, :cond_7

    .line 17
    .line 18
    const/4 v6, 0x2

    .line 19
    if-eq v0, v6, :cond_6

    .line 20
    .line 21
    if-eq v0, v4, :cond_2

    .line 22
    .line 23
    const/4 v6, 0x4

    .line 24
    if-eq v0, v6, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x5

    .line 27
    if-ne v0, v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, v2}, LF0/y;->T(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5}, LW5/d;->r()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 37
    .line 38
    shl-int/lit8 v0, v1, 0x3

    .line 39
    .line 40
    or-int/2addr v0, v2

    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->d(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return v3

    .line 49
    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/B;->c()Lcom/google/crypto/tink/shaded/protobuf/A;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    throw p0

    .line 54
    :cond_1
    return v2

    .line 55
    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/e0;->c()Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    shl-int/2addr v1, v4

    .line 60
    or-int/lit8 v5, v1, 0x4

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p1}, LF0/y;->e()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    const v7, 0x7fffffff

    .line 67
    .line 68
    .line 69
    if-eq v6, v7, :cond_4

    .line 70
    .line 71
    invoke-static {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/f0;->b(Ljava/lang/Object;LF0/y;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-nez v6, :cond_3

    .line 76
    .line 77
    :cond_4
    iget p1, p1, LF0/y;->b:I

    .line 78
    .line 79
    if-ne v5, p1, :cond_5

    .line 80
    .line 81
    iput-boolean v2, v0, Lcom/google/crypto/tink/shaded/protobuf/e0;->e:Z

    .line 82
    .line 83
    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 84
    .line 85
    or-int/lit8 p1, v1, 0x3

    .line 86
    .line 87
    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/e0;->d(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return v3

    .line 91
    :cond_5
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/B;

    .line 92
    .line 93
    const-string p1, "Protocol message end-group tag did not match expected tag."

    .line 94
    .line 95
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :cond_6
    invoke-virtual {p1}, LF0/y;->m()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 104
    .line 105
    shl-int/lit8 v0, v1, 0x3

    .line 106
    .line 107
    or-int/2addr v0, v6

    .line 108
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->d(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return v3

    .line 112
    :cond_7
    invoke-virtual {p1, v3}, LF0/y;->T(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, LW5/d;->s()J

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 120
    .line 121
    shl-int/lit8 p1, v1, 0x3

    .line 122
    .line 123
    or-int/2addr p1, v3

    .line 124
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/e0;->d(ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return v3

    .line 132
    :cond_8
    invoke-virtual {p1, v2}, LF0/y;->T(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5}, LW5/d;->v()J

    .line 136
    .line 137
    .line 138
    move-result-wide v5

    .line 139
    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    .line 140
    .line 141
    shl-int/lit8 p1, v1, 0x3

    .line 142
    .line 143
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/e0;->d(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    return v3
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method
