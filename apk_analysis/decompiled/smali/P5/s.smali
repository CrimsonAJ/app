.class public final LP5/s;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LP5/u;


# direct methods
.method public synthetic constructor <init>(LP5/u;I)V
    .locals 0

    .line 1
    iput p2, p0, LP5/s;->a:I

    iput-object p1, p0, LP5/s;->b:LP5/u;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1
    iget v0, p0, LP5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 7
    .line 8
    invoke-virtual {v0}, LP5/u;->clear()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 13
    .line 14
    invoke-virtual {v0}, LP5/u;->clear()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, LP5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LP5/u;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_0
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 14
    .line 15
    invoke-virtual {v0}, LP5/u;->c()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    instance-of v1, p1, Ljava/util/Map$Entry;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    check-cast p1, Ljava/util/Map$Entry;

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, LP5/u;->e(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v3, -0x1

    .line 46
    if-eq v1, v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, LP5/u;->k()[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    aget-object v0, v0, v1

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v0, p1}, LM4/a;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move p1, v2

    .line 67
    :goto_0
    return p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget v0, p0, LP5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 7
    .line 8
    invoke-virtual {v0}, LP5/u;->c()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, LP5/r;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, v0, v2}, LP5/r;-><init>(LP5/u;I)V

    .line 27
    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :goto_0
    return-object v0

    .line 31
    :pswitch_0
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 32
    .line 33
    invoke-virtual {v0}, LP5/u;->c()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance v1, LP5/r;

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-direct {v1, v0, v2}, LP5/r;-><init>(LP5/u;I)V

    .line 52
    .line 53
    .line 54
    move-object v0, v1

    .line 55
    :goto_1
    return-object v0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 58
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
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    iget v0, p0, LP5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 7
    .line 8
    invoke-virtual {v0}, LP5/u;->c()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, p1}, LP5/u;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget-object v0, LP5/u;->j:Ljava/lang/Object;

    .line 28
    .line 29
    if-eq p1, v0, :cond_1

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x0

    .line 34
    :goto_0
    return p1

    .line 35
    :pswitch_0
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 36
    .line 37
    invoke-virtual {v0}, LP5/u;->c()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    instance-of v1, p1, Ljava/util/Map$Entry;

    .line 53
    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    check-cast p1, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-virtual {v0}, LP5/u;->g()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-virtual {v0}, LP5/u;->d()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget-object v5, v0, LP5/u;->a:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, LP5/u;->i()[I

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v0}, LP5/u;->j()[Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v0}, LP5/u;->k()[Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-static/range {v2 .. v8}, LP5/q;->o(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    const/4 v1, -0x1

    .line 99
    if-ne p1, v1, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-virtual {v0, p1, v4}, LP5/u;->f(II)V

    .line 103
    .line 104
    .line 105
    iget p1, v0, LP5/u;->f:I

    .line 106
    .line 107
    const/4 v1, 0x1

    .line 108
    sub-int/2addr p1, v1

    .line 109
    iput p1, v0, LP5/u;->f:I

    .line 110
    .line 111
    iget p1, v0, LP5/u;->e:I

    .line 112
    .line 113
    add-int/lit8 p1, p1, 0x20

    .line 114
    .line 115
    iput p1, v0, LP5/u;->e:I

    .line 116
    .line 117
    move p1, v1

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    :goto_1
    const/4 p1, 0x0

    .line 120
    :goto_2
    return p1

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, LP5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 7
    .line 8
    invoke-virtual {v0}, LP5/u;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :pswitch_0
    iget-object v0, p0, LP5/s;->b:LP5/u;

    .line 14
    .line 15
    invoke-virtual {v0}, LP5/u;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
