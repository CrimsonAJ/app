.class public final LG2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# direct methods
.method public static a(Lcom/anilab/data/model/response/CommentResponse;)LH2/c;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "dto"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, LH2/c;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iget-object v3, v0, Lcom/anilab/data/model/response/CommentResponse;->d:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    const-string v3, ""

    .line 16
    .line 17
    :goto_0
    move-object v8, v3

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance v4, LB7/r;

    .line 20
    .line 21
    const/4 v5, 0x4

    .line 22
    invoke-direct {v4, v5, v3}, LB7/r;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    instance-of v3, v4, LV7/d;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    check-cast v4, LV7/d;

    .line 30
    .line 31
    invoke-interface {v4}, LV7/d;->b()LV7/j;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    new-instance v3, LV7/p;

    .line 37
    .line 38
    invoke-direct {v3, v4}, LV7/p;-><init>(LV7/j;)V

    .line 39
    .line 40
    .line 41
    :goto_1
    const-string v4, "\n"

    .line 42
    .line 43
    invoke-static {v3, v4}, LV7/l;->h0(LV7/j;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/16 v5, 0x1f5

    .line 52
    .line 53
    if-gt v4, v5, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/16 v4, 0x1f4

    .line 57
    .line 58
    invoke-virtual {v3, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const-string v4, "substring(...)"

    .line 63
    .line 64
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_2
    iget-object v3, v0, Lcom/anilab/data/model/response/CommentResponse;->e:Ljava/lang/Integer;

    .line 69
    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    move v9, v3

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move v9, v1

    .line 79
    :goto_3
    iget-object v3, v0, Lcom/anilab/data/model/response/CommentResponse;->f:Ljava/lang/Integer;

    .line 80
    .line 81
    if-eqz v3, :cond_4

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    :cond_4
    move v10, v1

    .line 88
    sget-object v16, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    iget-object v3, v0, Lcom/anilab/data/model/response/CommentResponse;->a:Ljava/lang/String;

    .line 91
    .line 92
    const/16 v21, 0x0

    .line 93
    .line 94
    const/16 v22, 0x0

    .line 95
    .line 96
    iget-wide v4, v0, Lcom/anilab/data/model/response/CommentResponse;->b:J

    .line 97
    .line 98
    iget-wide v6, v0, Lcom/anilab/data/model/response/CommentResponse;->c:J

    .line 99
    .line 100
    iget-wide v11, v0, Lcom/anilab/data/model/response/CommentResponse;->h:J

    .line 101
    .line 102
    iget-wide v13, v0, Lcom/anilab/data/model/response/CommentResponse;->i:J

    .line 103
    .line 104
    const/4 v15, 0x0

    .line 105
    const/16 v17, 0x0

    .line 106
    .line 107
    iget-object v0, v0, Lcom/anilab/data/model/response/CommentResponse;->g:Ljava/lang/String;

    .line 108
    .line 109
    const/16 v20, 0x0

    .line 110
    .line 111
    const/16 v23, 0x0

    .line 112
    .line 113
    move-object/from16 v18, v16

    .line 114
    .line 115
    move-object/from16 v19, v0

    .line 116
    .line 117
    invoke-direct/range {v2 .. v23}, LH2/c;-><init>(Ljava/lang/String;JJLjava/lang/String;IIJJLH2/y;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZZZZ)V

    .line 118
    .line 119
    .line 120
    return-object v2
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


# virtual methods
.method public final bridge synthetic n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/CommentResponse;

    .line 2
    .line 3
    invoke-static {p1}, LG2/f;->a(Lcom/anilab/data/model/response/CommentResponse;)LH2/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
