.class public final LF0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:[I

.field public final c:[I

.field public final d:Lb7/c;

.field public final e:I

.field public final f:I

.field public final g:Z


# direct methods
.method public constructor <init>(Lb7/c;Ljava/util/ArrayList;[I[I)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LF0/q;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p3, p0, LF0/q;->b:[I

    .line 7
    .line 8
    iput-object p4, p0, LF0/q;->c:[I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p3, v0}, Ljava/util/Arrays;->fill([II)V

    .line 12
    .line 13
    .line 14
    invoke-static {p4, v0}, Ljava/util/Arrays;->fill([II)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LF0/q;->d:Lb7/c;

    .line 18
    .line 19
    iget-object p1, p1, Lb7/c;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, LF0/d;

    .line 22
    .line 23
    iget-object p3, p1, LF0/d;->a:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    iput p3, p0, LF0/q;->e:I

    .line 30
    .line 31
    iget-object p1, p1, LF0/d;->b:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, LF0/q;->f:I

    .line 38
    .line 39
    const/4 p4, 0x1

    .line 40
    iput-boolean p4, p0, LF0/q;->g:Z

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, LF0/p;

    .line 55
    .line 56
    :goto_0
    if-eqz v1, :cond_1

    .line 57
    .line 58
    iget v2, v1, LF0/p;->a:I

    .line 59
    .line 60
    if-nez v2, :cond_1

    .line 61
    .line 62
    iget v1, v1, LF0/p;->b:I

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    :cond_1
    new-instance v1, LF0/p;

    .line 67
    .line 68
    invoke-direct {v1, v0, v0, v0}, LF0/p;-><init>(III)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    new-instance v1, LF0/p;

    .line 75
    .line 76
    invoke-direct {v1, p3, p1, v0}, LF0/p;-><init>(III)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    iget-object v1, p0, LF0/q;->c:[I

    .line 91
    .line 92
    iget-object v2, p0, LF0/q;->b:[I

    .line 93
    .line 94
    iget-object v3, p0, LF0/q;->d:Lb7/c;

    .line 95
    .line 96
    if-eqz p3, :cond_5

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    check-cast p3, LF0/p;

    .line 103
    .line 104
    move v4, v0

    .line 105
    :goto_1
    iget v5, p3, LF0/p;->c:I

    .line 106
    .line 107
    if-ge v4, v5, :cond_3

    .line 108
    .line 109
    iget v5, p3, LF0/p;->a:I

    .line 110
    .line 111
    add-int/2addr v5, v4

    .line 112
    iget v6, p3, LF0/p;->b:I

    .line 113
    .line 114
    add-int/2addr v6, v4

    .line 115
    invoke-virtual {v3, v5, v6}, Lb7/c;->s(II)Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-eqz v7, :cond_4

    .line 120
    .line 121
    move v7, p4

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    const/4 v7, 0x2

    .line 124
    :goto_2
    shl-int/lit8 v8, v6, 0x4

    .line 125
    .line 126
    or-int/2addr v8, v7

    .line 127
    aput v8, v2, v5

    .line 128
    .line 129
    shl-int/lit8 v5, v5, 0x4

    .line 130
    .line 131
    or-int/2addr v5, v7

    .line 132
    aput v5, v1, v6

    .line 133
    .line 134
    add-int/lit8 v4, v4, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    iget-boolean p1, p0, LF0/q;->g:Z

    .line 138
    .line 139
    if-eqz p1, :cond_b

    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    move p3, v0

    .line 146
    move p4, p3

    .line 147
    :goto_3
    if-ge p4, p1, :cond_b

    .line 148
    .line 149
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    add-int/lit8 p4, p4, 0x1

    .line 154
    .line 155
    check-cast v4, LF0/p;

    .line 156
    .line 157
    :goto_4
    iget v5, v4, LF0/p;->a:I

    .line 158
    .line 159
    if-ge p3, v5, :cond_a

    .line 160
    .line 161
    aget v5, v2, p3

    .line 162
    .line 163
    if-nez v5, :cond_9

    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    move v6, v0

    .line 170
    move v7, v6

    .line 171
    :goto_5
    if-ge v6, v5, :cond_9

    .line 172
    .line 173
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    check-cast v8, LF0/p;

    .line 178
    .line 179
    :goto_6
    iget v9, v8, LF0/p;->b:I

    .line 180
    .line 181
    if-ge v7, v9, :cond_8

    .line 182
    .line 183
    aget v9, v1, v7

    .line 184
    .line 185
    if-nez v9, :cond_7

    .line 186
    .line 187
    invoke-virtual {v3, p3, v7}, Lb7/c;->u(II)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-eqz v9, :cond_7

    .line 192
    .line 193
    invoke-virtual {v3, p3, v7}, Lb7/c;->s(II)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_6

    .line 198
    .line 199
    const/16 v5, 0x8

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_6
    const/4 v5, 0x4

    .line 203
    :goto_7
    shl-int/lit8 v6, v7, 0x4

    .line 204
    .line 205
    or-int/2addr v6, v5

    .line 206
    aput v6, v2, p3

    .line 207
    .line 208
    shl-int/lit8 v6, p3, 0x4

    .line 209
    .line 210
    or-int/2addr v5, v6

    .line 211
    aput v5, v1, v7

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_8
    iget v7, v8, LF0/p;->c:I

    .line 218
    .line 219
    add-int/2addr v7, v9

    .line 220
    add-int/lit8 v6, v6, 0x1

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_9
    :goto_8
    add-int/lit8 p3, p3, 0x1

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_a
    iget p3, v4, LF0/p;->c:I

    .line 227
    .line 228
    add-int/2addr p3, v5

    .line 229
    goto :goto_3

    .line 230
    :cond_b
    return-void
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
.end method

.method public static a(Ljava/util/ArrayDeque;IZ)LF0/r;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LF0/r;

    .line 16
    .line 17
    iget v1, v0, LF0/r;->a:I

    .line 18
    .line 19
    if-ne v1, p1, :cond_0

    .line 20
    .line 21
    iget-boolean v1, v0, LF0/r;->c:Z

    .line 22
    .line 23
    if-ne v1, p2, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, LF0/r;

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    iget v1, p1, LF0/r;->b:I

    .line 45
    .line 46
    add-int/lit8 v1, v1, -0x1

    .line 47
    .line 48
    iput v1, p1, LF0/r;->b:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget v1, p1, LF0/r;->b:I

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    iput v1, p1, LF0/r;->b:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    return-object v0
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method
