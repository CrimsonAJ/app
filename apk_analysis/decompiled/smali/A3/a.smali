.class public final LA3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/j;


# instance fields
.field public final a:LA3/b;

.field public final b:LA4/r;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LA3/b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, LA3/b;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LA3/a;->a:LA3/b;

    .line 12
    .line 13
    new-instance v0, LA4/r;

    .line 14
    .line 15
    const/16 v1, 0xae2

    .line 16
    .line 17
    invoke-direct {v0, v1}, LA4/r;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LA3/a;->b:LA4/r;

    .line 21
    .line 22
    return-void
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
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
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

.method public final b(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LA3/a;->c:Z

    .line 3
    .line 4
    iget-object p1, p0, LA3/a;->a:LA3/b;

    .line 5
    .line 6
    invoke-virtual {p1}, LA3/b;->a()V

    .line 7
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final f(Lq3/k;Lc7/j;)I
    .locals 4

    .line 1
    iget-object p2, p0, LA3/a;->b:LA4/r;

    .line 2
    .line 3
    iget-object v0, p2, LA4/r;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, [B

    .line 6
    .line 7
    check-cast p1, Lq3/g;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0xae2

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1, v2}, Lq3/g;->D([BII)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, -0x1

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    invoke-virtual {p2, v1}, LA4/r;->H(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1}, LA4/r;->G(I)V

    .line 24
    .line 25
    .line 26
    iget-boolean p1, p0, LA3/a;->c:Z

    .line 27
    .line 28
    iget-object v0, p0, LA3/a;->a:LA3/b;

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    const/4 p1, 0x4

    .line 35
    invoke-virtual {v0, v2, v3, p1}, LA3/b;->e(JI)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, LA3/a;->c:Z

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0, p2}, LA3/b;->c(LA4/r;)V

    .line 42
    .line 43
    .line 44
    return v1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final i(Lq3/l;)V
    .locals 3

    .line 1
    new-instance v0, LA3/I;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2}, LA3/I;-><init>(II)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA3/a;->a:LA3/b;

    .line 9
    .line 10
    invoke-virtual {v1, p1, v0}, LA3/b;->f(Lq3/l;LA3/I;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lq3/l;->i()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lq3/m;

    .line 17
    .line 18
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v2}, Lq3/m;-><init>(J)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0}, Lq3/l;->r(Lq3/r;)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public final j(Lq3/k;)Z
    .locals 13

    .line 1
    new-instance v0, LA4/r;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, LA4/r;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    iget-object v4, v0, LA4/r;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, [B

    .line 13
    .line 14
    move-object v5, p1

    .line 15
    check-cast v5, Lq3/g;

    .line 16
    .line 17
    invoke-virtual {v5, v4, v2, v1, v2}, Lq3/g;->t([BIIZ)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, LA4/r;->H(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, LA4/r;->z()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const v6, 0x494433

    .line 28
    .line 29
    .line 30
    const/4 v7, 0x3

    .line 31
    if-eq v4, v6, :cond_6

    .line 32
    .line 33
    iput v2, v5, Lq3/g;->f:I

    .line 34
    .line 35
    invoke-virtual {v5, v3, v2}, Lq3/g;->c(IZ)Z

    .line 36
    .line 37
    .line 38
    move p1, v2

    .line 39
    move v4, v3

    .line 40
    :goto_1
    iget-object v6, v0, LA4/r;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v6, [B

    .line 43
    .line 44
    const/4 v8, 0x6

    .line 45
    invoke-virtual {v5, v6, v2, v8, v2}, Lq3/g;->t([BIIZ)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, LA4/r;->H(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, LA4/r;->C()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const/16 v9, 0xb77

    .line 56
    .line 57
    if-eq v6, v9, :cond_1

    .line 58
    .line 59
    iput v2, v5, Lq3/g;->f:I

    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    sub-int p1, v4, v3

    .line 64
    .line 65
    const/16 v6, 0x2000

    .line 66
    .line 67
    if-lt p1, v6, :cond_0

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_0
    invoke-virtual {v5, v4, v2}, Lq3/g;->c(IZ)Z

    .line 71
    .line 72
    .line 73
    move p1, v2

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 v6, 0x1

    .line 76
    add-int/2addr p1, v6

    .line 77
    const/4 v9, 0x4

    .line 78
    if-lt p1, v9, :cond_2

    .line 79
    .line 80
    return v6

    .line 81
    :cond_2
    iget-object v10, v0, LA4/r;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v10, [B

    .line 84
    .line 85
    array-length v11, v10

    .line 86
    const/4 v12, -0x1

    .line 87
    if-ge v11, v8, :cond_3

    .line 88
    .line 89
    move v9, v12

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    const/4 v11, 0x5

    .line 92
    aget-byte v11, v10, v11

    .line 93
    .line 94
    and-int/lit16 v11, v11, 0xf8

    .line 95
    .line 96
    shr-int/2addr v11, v7

    .line 97
    if-le v11, v1, :cond_4

    .line 98
    .line 99
    const/4 v8, 0x2

    .line 100
    aget-byte v9, v10, v8

    .line 101
    .line 102
    and-int/lit8 v9, v9, 0x7

    .line 103
    .line 104
    shl-int/lit8 v9, v9, 0x8

    .line 105
    .line 106
    aget-byte v10, v10, v7

    .line 107
    .line 108
    and-int/lit16 v10, v10, 0xff

    .line 109
    .line 110
    or-int/2addr v9, v10

    .line 111
    add-int/2addr v9, v6

    .line 112
    mul-int/2addr v9, v8

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    aget-byte v6, v10, v9

    .line 115
    .line 116
    and-int/lit16 v9, v6, 0xc0

    .line 117
    .line 118
    shr-int/lit8 v8, v9, 0x6

    .line 119
    .line 120
    and-int/lit8 v6, v6, 0x3f

    .line 121
    .line 122
    invoke-static {v8, v6}, Ll3/a;->d(II)I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    :goto_2
    if-ne v9, v12, :cond_5

    .line 127
    .line 128
    :goto_3
    return v2

    .line 129
    :cond_5
    add-int/lit8 v9, v9, -0x6

    .line 130
    .line 131
    invoke-virtual {v5, v9, v2}, Lq3/g;->c(IZ)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_6
    invoke-virtual {v0, v7}, LA4/r;->I(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, LA4/r;->w()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    add-int/lit8 v6, v4, 0xa

    .line 143
    .line 144
    add-int/2addr v3, v6

    .line 145
    invoke-virtual {v5, v4, v2}, Lq3/g;->c(IZ)Z

    .line 146
    .line 147
    .line 148
    goto/16 :goto_0
    .line 149
    .line 150
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
