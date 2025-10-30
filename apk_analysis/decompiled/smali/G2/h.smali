.class public final LG2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# instance fields
.field public final a:LG2/s;


# direct methods
.method public constructor <init>(LG2/s;)V
    .locals 1

    .line 1
    const-string v0, "movieMapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LG2/h;->a:LG2/s;

    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;

    .line 4
    .line 5
    const-string v1, "dto"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iget-object v2, v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->e:Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    move v9, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v9, v1

    .line 22
    :goto_0
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    iget-object v4, v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->f:Ljava/lang/Long;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    move-wide v10, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-wide v10, v2

    .line 35
    :goto_1
    iget-object v4, v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->g:Ljava/lang/Float;

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_3

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    :cond_2
    move v12, v1

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string v1, "Cannot round NaN value."

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :goto_2
    iget-object v1, v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->h:Ljava/lang/Long;

    .line 64
    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    :cond_4
    move-wide v13, v2

    .line 72
    iget-object v1, v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->i:Lcom/anilab/data/model/response/MovieResponse;

    .line 73
    .line 74
    move-object/from16 v2, p0

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    iget-object v3, v2, LG2/h;->a:LG2/s;

    .line 79
    .line 80
    invoke-virtual {v3, v1}, LG2/s;->a(Lcom/anilab/data/model/response/MovieResponse;)Lcom/anilab/domain/model/Movie;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :goto_3
    move-object v15, v1

    .line 85
    goto :goto_4

    .line 86
    :cond_5
    const/4 v1, 0x0

    .line 87
    goto :goto_3

    .line 88
    :goto_4
    new-instance v3, LH2/g;

    .line 89
    .line 90
    iget-wide v4, v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->a:J

    .line 91
    .line 92
    iget-object v6, v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->b:Ljava/lang/Long;

    .line 93
    .line 94
    iget-object v7, v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->c:Ljava/lang/Long;

    .line 95
    .line 96
    iget-object v8, v0, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->d:Ljava/lang/Long;

    .line 97
    .line 98
    invoke-direct/range {v3 .. v15}, LH2/g;-><init>(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;IJIJLcom/anilab/domain/model/Movie;)V

    .line 99
    .line 100
    .line 101
    return-object v3
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
