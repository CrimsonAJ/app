.class public final Ll3/F;
.super Ll3/v;
.source "SourceFile"


# static fields
.field public static final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Ll3/F;->i:I

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
.end method


# virtual methods
.method public final e(Ljava/nio/ByteBuffer;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int v2, v1, v0

    .line 10
    .line 11
    iget-object v3, p0, Ll3/v;->b:Ll3/h;

    .line 12
    .line 13
    iget v3, v3, Ll3/h;->c:I

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    sget v5, Ll3/F;->i:I

    .line 17
    .line 18
    const-wide v6, 0x3e00000000200000L    # 4.656612875245797E-10

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/high16 v8, 0x20000000

    .line 24
    .line 25
    if-eq v3, v8, :cond_2

    .line 26
    .line 27
    const/high16 v8, 0x30000000

    .line 28
    .line 29
    if-ne v3, v8, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Ll3/v;->k(I)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :goto_0
    if-ge v0, v1, :cond_4

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    and-int/lit16 v3, v3, 0xff

    .line 42
    .line 43
    add-int/lit8 v8, v0, 0x1

    .line 44
    .line 45
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    and-int/lit16 v8, v8, 0xff

    .line 50
    .line 51
    shl-int/lit8 v8, v8, 0x8

    .line 52
    .line 53
    or-int/2addr v3, v8

    .line 54
    add-int/lit8 v8, v0, 0x2

    .line 55
    .line 56
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    and-int/lit16 v8, v8, 0xff

    .line 61
    .line 62
    shl-int/lit8 v8, v8, 0x10

    .line 63
    .line 64
    or-int/2addr v3, v8

    .line 65
    add-int/lit8 v8, v0, 0x3

    .line 66
    .line 67
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    and-int/lit16 v8, v8, 0xff

    .line 72
    .line 73
    shl-int/lit8 v8, v8, 0x18

    .line 74
    .line 75
    or-int/2addr v3, v8

    .line 76
    int-to-double v8, v3

    .line 77
    mul-double/2addr v8, v6

    .line 78
    double-to-float v3, v8

    .line 79
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-ne v3, v5, :cond_0

    .line 84
    .line 85
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    :cond_0
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    .line 92
    add-int/lit8 v0, v0, 0x4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_2
    div-int/lit8 v2, v2, 0x3

    .line 102
    .line 103
    mul-int/lit8 v2, v2, 0x4

    .line 104
    .line 105
    invoke-virtual {p0, v2}, Ll3/v;->k(I)Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :goto_1
    if-ge v0, v1, :cond_4

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    and-int/lit16 v3, v3, 0xff

    .line 116
    .line 117
    shl-int/lit8 v3, v3, 0x8

    .line 118
    .line 119
    add-int/lit8 v8, v0, 0x1

    .line 120
    .line 121
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    and-int/lit16 v8, v8, 0xff

    .line 126
    .line 127
    shl-int/lit8 v8, v8, 0x10

    .line 128
    .line 129
    or-int/2addr v3, v8

    .line 130
    add-int/lit8 v8, v0, 0x2

    .line 131
    .line 132
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    and-int/lit16 v8, v8, 0xff

    .line 137
    .line 138
    shl-int/lit8 v8, v8, 0x18

    .line 139
    .line 140
    or-int/2addr v3, v8

    .line 141
    int-to-double v8, v3

    .line 142
    mul-double/2addr v8, v6

    .line 143
    double-to-float v3, v8

    .line 144
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-ne v3, v5, :cond_3

    .line 149
    .line 150
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    :cond_3
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 155
    .line 156
    .line 157
    add-int/lit8 v0, v0, 0x3

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 168
    .line 169
    .line 170
    return-void
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
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public final g(Ll3/h;)Ll3/h;
    .locals 3

    .line 1
    iget v0, p1, Ll3/h;->c:I

    .line 2
    .line 3
    const/high16 v1, 0x20000000

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/high16 v1, 0x30000000

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Ll3/i;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Ll3/i;-><init>(Ll3/h;)V

    .line 18
    .line 19
    .line 20
    throw v0

    .line 21
    :cond_1
    :goto_0
    if-eq v0, v2, :cond_2

    .line 22
    .line 23
    new-instance v0, Ll3/h;

    .line 24
    .line 25
    iget v1, p1, Ll3/h;->a:I

    .line 26
    .line 27
    iget p1, p1, Ll3/h;->b:I

    .line 28
    .line 29
    invoke-direct {v0, v1, p1, v2}, Ll3/h;-><init>(III)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_2
    sget-object p1, Ll3/h;->e:Ll3/h;

    .line 34
    .line 35
    return-object p1
    .line 36
    .line 37
    .line 38
.end method
