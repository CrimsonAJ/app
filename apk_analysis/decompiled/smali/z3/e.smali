.class public final Lz3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz3/f;

.field public final b:LA4/r;

.field public c:I

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz3/f;

    .line 5
    .line 6
    invoke-direct {v0}, Lz3/f;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz3/e;->a:Lz3/f;

    .line 10
    .line 11
    new-instance v0, LA4/r;

    .line 12
    .line 13
    const v1, 0xfe01

    .line 14
    .line 15
    .line 16
    new-array v1, v1, [B

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, v2, v1}, LA4/r;-><init>(I[B)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lz3/e;->b:LA4/r;

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    iput v0, p0, Lz3/e;->c:I

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public final a(I)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lz3/e;->d:I

    .line 3
    .line 4
    :cond_0
    iget v1, p0, Lz3/e;->d:I

    .line 5
    .line 6
    add-int v2, p1, v1

    .line 7
    .line 8
    iget-object v3, p0, Lz3/e;->a:Lz3/f;

    .line 9
    .line 10
    iget v4, v3, Lz3/f;->c:I

    .line 11
    .line 12
    if-ge v2, v4, :cond_1

    .line 13
    .line 14
    iget-object v2, v3, Lz3/f;->f:[I

    .line 15
    .line 16
    add-int/lit8 v3, v1, 0x1

    .line 17
    .line 18
    iput v3, p0, Lz3/e;->d:I

    .line 19
    .line 20
    add-int/2addr v1, p1

    .line 21
    aget v1, v2, v1

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    const/16 v2, 0xff

    .line 25
    .line 26
    if-eq v1, v2, :cond_0

    .line 27
    .line 28
    :cond_1
    return v0
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

.method public final b(Lq3/g;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v1

    .line 8
    :goto_0
    invoke-static {v2}, Ll4/a;->m(Z)V

    .line 9
    .line 10
    .line 11
    iget-boolean v2, p0, Lz3/e;->e:Z

    .line 12
    .line 13
    iget-object v3, p0, Lz3/e;->b:LA4/r;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iput-boolean v1, p0, Lz3/e;->e:Z

    .line 18
    .line 19
    invoke-virtual {v3, v1}, LA4/r;->E(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_1
    iget-boolean v2, p0, Lz3/e;->e:Z

    .line 23
    .line 24
    if-nez v2, :cond_9

    .line 25
    .line 26
    iget v2, p0, Lz3/e;->c:I

    .line 27
    .line 28
    iget-object v4, p0, Lz3/e;->a:Lz3/f;

    .line 29
    .line 30
    if-gez v2, :cond_4

    .line 31
    .line 32
    const-wide/16 v5, -0x1

    .line 33
    .line 34
    invoke-virtual {v4, p1, v5, v6}, Lz3/f;->b(Lq3/g;J)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_6

    .line 39
    .line 40
    invoke-virtual {v4, p1, v0}, Lz3/f;->a(Lq3/g;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_2
    iget v2, v4, Lz3/f;->d:I

    .line 48
    .line 49
    iget v5, v4, Lz3/f;->a:I

    .line 50
    .line 51
    and-int/2addr v5, v0

    .line 52
    if-ne v5, v0, :cond_3

    .line 53
    .line 54
    iget v5, v3, LA4/r;->b:I

    .line 55
    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lz3/e;->a(I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    add-int/2addr v2, v5

    .line 63
    iget v5, p0, Lz3/e;->d:I

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v5, v1

    .line 67
    :goto_2
    :try_start_0
    invoke-virtual {p1, v2}, Lq3/g;->n(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    iput v5, p0, Lz3/e;->c:I

    .line 71
    .line 72
    :cond_4
    iget v2, p0, Lz3/e;->c:I

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Lz3/e;->a(I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iget v5, p0, Lz3/e;->c:I

    .line 79
    .line 80
    iget v6, p0, Lz3/e;->d:I

    .line 81
    .line 82
    add-int/2addr v5, v6

    .line 83
    if-lez v2, :cond_7

    .line 84
    .line 85
    iget v6, v3, LA4/r;->b:I

    .line 86
    .line 87
    add-int/2addr v6, v2

    .line 88
    invoke-virtual {v3, v6}, LA4/r;->f(I)V

    .line 89
    .line 90
    .line 91
    iget-object v6, v3, LA4/r;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v6, [B

    .line 94
    .line 95
    iget v7, v3, LA4/r;->b:I

    .line 96
    .line 97
    :try_start_1
    invoke-virtual {p1, v6, v7, v2, v1}, Lq3/g;->e([BIIZ)Z
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 98
    .line 99
    .line 100
    iget v6, v3, LA4/r;->b:I

    .line 101
    .line 102
    add-int/2addr v6, v2

    .line 103
    invoke-virtual {v3, v6}, LA4/r;->G(I)V

    .line 104
    .line 105
    .line 106
    iget-object v2, v4, Lz3/f;->f:[I

    .line 107
    .line 108
    add-int/lit8 v6, v5, -0x1

    .line 109
    .line 110
    aget v2, v2, v6

    .line 111
    .line 112
    const/16 v6, 0xff

    .line 113
    .line 114
    if-eq v2, v6, :cond_5

    .line 115
    .line 116
    move v2, v0

    .line 117
    goto :goto_3

    .line 118
    :cond_5
    move v2, v1

    .line 119
    :goto_3
    iput-boolean v2, p0, Lz3/e;->e:Z

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :catch_0
    :cond_6
    :goto_4
    return v1

    .line 123
    :cond_7
    :goto_5
    iget v2, v4, Lz3/f;->c:I

    .line 124
    .line 125
    if-ne v5, v2, :cond_8

    .line 126
    .line 127
    const/4 v5, -0x1

    .line 128
    :cond_8
    iput v5, p0, Lz3/e;->c:I

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_9
    return v0
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
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
