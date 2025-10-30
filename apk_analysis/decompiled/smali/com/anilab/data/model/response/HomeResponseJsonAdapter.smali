.class public final Lcom/anilab/data/model/response/HomeResponseJsonAdapter;
.super Lo7/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/k;"
    }
.end annotation


# instance fields
.field public final a:Lk4/E;

.field public final b:Lo7/k;

.field public final c:Lo7/k;

.field public final d:Lo7/k;

.field public final e:Lo7/k;

.field public final f:Lo7/k;

.field public final g:Lo7/k;


# direct methods
.method public constructor <init>(Lo7/y;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "moshi"

    .line 4
    .line 5
    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v6, "data"

    .line 12
    .line 13
    const-string v7, "filter"

    .line 14
    .line 15
    const-string v3, "id"

    .line 16
    .line 17
    const-string v4, "title"

    .line 18
    .line 19
    const-string v5, "type"

    .line 20
    .line 21
    const-string v8, "tabs"

    .line 22
    .line 23
    const-string v9, "continue-watch"

    .line 24
    .line 25
    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Lk4/E;->o([Ljava/lang/String;)Lk4/E;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iput-object v2, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->a:Lk4/E;

    .line 34
    .line 35
    sget-object v2, LB7/v;->a:LB7/v;

    .line 36
    .line 37
    const-string v3, "id"

    .line 38
    .line 39
    const-class v4, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, v4, v2, v3}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iput-object v3, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->b:Lo7/k;

    .line 46
    .line 47
    const-string v3, "type"

    .line 48
    .line 49
    const-class v4, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p1, v4, v2, v3}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iput-object v3, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->c:Lo7/k;

    .line 56
    .line 57
    new-array v3, v1, [Ljava/lang/reflect/Type;

    .line 58
    .line 59
    const-class v4, Lcom/anilab/data/model/response/MovieResponse;

    .line 60
    .line 61
    aput-object v4, v3, v0

    .line 62
    .line 63
    invoke-static {v3}, Lo7/D;->f([Ljava/lang/reflect/Type;)Lp7/c;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v4, "data"

    .line 68
    .line 69
    invoke-virtual {p1, v3, v2, v4}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iput-object v3, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->d:Lo7/k;

    .line 74
    .line 75
    new-array v3, v1, [Ljava/lang/reflect/Type;

    .line 76
    .line 77
    const-class v4, Lcom/anilab/data/model/response/FilterResponse;

    .line 78
    .line 79
    aput-object v4, v3, v0

    .line 80
    .line 81
    invoke-static {v3}, Lo7/D;->f([Ljava/lang/reflect/Type;)Lp7/c;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v4, "filter"

    .line 86
    .line 87
    invoke-virtual {p1, v3, v2, v4}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iput-object v3, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->e:Lo7/k;

    .line 92
    .line 93
    new-array v3, v1, [Ljava/lang/reflect/Type;

    .line 94
    .line 95
    const-class v4, Lcom/anilab/data/model/response/TabResponse;

    .line 96
    .line 97
    aput-object v4, v3, v0

    .line 98
    .line 99
    invoke-static {v3}, Lo7/D;->f([Ljava/lang/reflect/Type;)Lp7/c;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const-string v4, "tabs"

    .line 104
    .line 105
    invoke-virtual {p1, v3, v2, v4}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    iput-object v3, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->f:Lo7/k;

    .line 110
    .line 111
    new-array v1, v1, [Ljava/lang/reflect/Type;

    .line 112
    .line 113
    const-class v3, Lcom/anilab/data/model/response/ContinueWatchRowResponse;

    .line 114
    .line 115
    aput-object v3, v1, v0

    .line 116
    .line 117
    invoke-static {v1}, Lo7/D;->f([Ljava/lang/reflect/Type;)Lp7/c;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v1, "continueWatch"

    .line 122
    .line 123
    invoke-virtual {p1, v0, v2, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->g:Lo7/k;

    .line 128
    .line 129
    return-void
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
.method public final b(Lo7/n;)Ljava/lang/Object;
    .locals 9

    .line 1
    const-string v0, "reader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lo7/n;->d()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move-object v2, v0

    .line 11
    move-object v3, v2

    .line 12
    move-object v4, v3

    .line 13
    move-object v5, v4

    .line 14
    move-object v6, v5

    .line 15
    move-object v7, v6

    .line 16
    move-object v8, v7

    .line 17
    :goto_0
    invoke-virtual {p1}, Lo7/n;->F()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->a:Lk4/E;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lo7/n;->h0(Lk4/E;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v1, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->b:Lo7/k;

    .line 30
    .line 31
    packed-switch v0, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_0
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->g:Lo7/k;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v8, v0

    .line 42
    check-cast v8, Ljava/util/List;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_1
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->f:Lo7/k;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v7, v0

    .line 52
    check-cast v7, Ljava/util/List;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_2
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->e:Lo7/k;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v6, v0

    .line 62
    check-cast v6, Ljava/util/List;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_3
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->d:Lo7/k;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v5, v0

    .line 72
    check-cast v5, Ljava/util/List;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :pswitch_4
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->c:Lo7/k;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    move-object v4, v0

    .line 82
    check-cast v4, Ljava/lang/Integer;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :pswitch_5
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object v3, v0

    .line 90
    check-cast v3, Ljava/lang/String;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_6
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object v2, v0

    .line 98
    check-cast v2, Ljava/lang/String;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :pswitch_7
    invoke-virtual {p1}, Lo7/n;->i0()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lo7/n;->j0()V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {p1}, Lo7/n;->s()V

    .line 109
    .line 110
    .line 111
    new-instance v1, Lcom/anilab/data/model/response/HomeResponse;

    .line 112
    .line 113
    invoke-direct/range {v1 .. v8}, Lcom/anilab/data/model/response/HomeResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final e(Lo7/q;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Lcom/anilab/data/model/response/HomeResponse;

    .line 2
    .line 3
    const-string v0, "writer"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lo7/q;->d()Lo7/p;

    .line 11
    .line 12
    .line 13
    const-string v0, "id"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->b:Lo7/k;

    .line 19
    .line 20
    iget-object v1, p2, Lcom/anilab/data/model/response/HomeResponse;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const-string v1, "title"

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 28
    .line 29
    .line 30
    iget-object v1, p2, Lcom/anilab/data/model/response/HomeResponse;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "type"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->c:Lo7/k;

    .line 41
    .line 42
    iget-object v1, p2, Lcom/anilab/data/model/response/HomeResponse;->c:Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const-string v0, "data"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->d:Lo7/k;

    .line 53
    .line 54
    iget-object v1, p2, Lcom/anilab/data/model/response/HomeResponse;->d:Ljava/util/List;

    .line 55
    .line 56
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const-string v0, "filter"

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->e:Lo7/k;

    .line 65
    .line 66
    iget-object v1, p2, Lcom/anilab/data/model/response/HomeResponse;->e:Ljava/util/List;

    .line 67
    .line 68
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "tabs"

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->f:Lo7/k;

    .line 77
    .line 78
    iget-object v1, p2, Lcom/anilab/data/model/response/HomeResponse;->f:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const-string v0, "continue-watch"

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 86
    .line 87
    .line 88
    iget-object p2, p2, Lcom/anilab/data/model/response/HomeResponse;->g:Ljava/util/List;

    .line 89
    .line 90
    iget-object v0, p0, Lcom/anilab/data/model/response/HomeResponseJsonAdapter;->g:Lo7/k;

    .line 91
    .line 92
    invoke-virtual {v0, p1, p2}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lo7/q;->g()Lo7/p;

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 100
    .line 101
    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    .line 102
    .line 103
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(HomeResponse)"

    .line 4
    .line 5
    invoke-static {v0, v1}, LA0/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
