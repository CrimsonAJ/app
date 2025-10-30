.class public final Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;
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

.field public final h:Lo7/k;


# direct methods
.method public constructor <init>(Lo7/y;)V
    .locals 9

    .line 1
    const-string v0, "moshi"

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
    const-string v7, "app_token"

    .line 10
    .line 11
    const-string v8, "client_id"

    .line 12
    .line 13
    const-string v1, "download"

    .line 14
    .line 15
    const-string v2, "movieConfig"

    .line 16
    .line 17
    const-string v3, "commentConfig"

    .line 18
    .line 19
    const-string v4, "contactUs"

    .line 20
    .line 21
    const-string v5, "srcConfig"

    .line 22
    .line 23
    const-string v6, "player"

    .line 24
    .line 25
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lk4/E;->o([Ljava/lang/String;)Lk4/E;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->a:Lk4/E;

    .line 34
    .line 35
    sget-object v0, LB7/v;->a:LB7/v;

    .line 36
    .line 37
    const-string v1, "downloader"

    .line 38
    .line 39
    const-class v2, Lcom/anilab/data/model/response/DownloaderResponse;

    .line 40
    .line 41
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->b:Lo7/k;

    .line 46
    .line 47
    const-string v1, "movieConfig"

    .line 48
    .line 49
    const-class v2, Lcom/anilab/data/model/response/MovieConfigResponse;

    .line 50
    .line 51
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput-object v1, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->c:Lo7/k;

    .line 56
    .line 57
    const-string v1, "commentConfig"

    .line 58
    .line 59
    const-class v2, Lcom/anilab/data/model/response/CommentConfigResponse;

    .line 60
    .line 61
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iput-object v1, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->d:Lo7/k;

    .line 66
    .line 67
    const-string v1, "contactUs"

    .line 68
    .line 69
    const-class v2, Lcom/anilab/data/model/response/ContactUsResponse;

    .line 70
    .line 71
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->e:Lo7/k;

    .line 76
    .line 77
    const-string v1, "srcConfig"

    .line 78
    .line 79
    const-class v2, Lcom/anilab/data/model/response/SrcConfigResponse;

    .line 80
    .line 81
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->f:Lo7/k;

    .line 86
    .line 87
    const-string v1, "player"

    .line 88
    .line 89
    const-class v2, Lcom/anilab/data/model/response/ListPlayerResponse;

    .line 90
    .line 91
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iput-object v1, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->g:Lo7/k;

    .line 96
    .line 97
    const-string v1, "appToken"

    .line 98
    .line 99
    const-class v2, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->h:Lo7/k;

    .line 106
    .line 107
    return-void
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


# virtual methods
.method public final b(Lo7/n;)Ljava/lang/Object;
    .locals 10

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
    move-object v9, v8

    .line 18
    :goto_0
    invoke-virtual {p1}, Lo7/n;->F()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->a:Lk4/E;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lo7/n;->h0(Lk4/E;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v1, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->h:Lo7/k;

    .line 31
    .line 32
    packed-switch v0, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_0
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v9, v0

    .line 41
    check-cast v9, Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v8, v0

    .line 49
    check-cast v8, Ljava/lang/String;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_2
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->g:Lo7/k;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v7, v0

    .line 59
    check-cast v7, Lcom/anilab/data/model/response/ListPlayerResponse;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_3
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->f:Lo7/k;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v6, v0

    .line 69
    check-cast v6, Lcom/anilab/data/model/response/SrcConfigResponse;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_4
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->e:Lo7/k;

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    move-object v5, v0

    .line 79
    check-cast v5, Lcom/anilab/data/model/response/ContactUsResponse;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_5
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->d:Lo7/k;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v4, v0

    .line 89
    check-cast v4, Lcom/anilab/data/model/response/CommentConfigResponse;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_6
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->c:Lo7/k;

    .line 93
    .line 94
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    move-object v3, v0

    .line 99
    check-cast v3, Lcom/anilab/data/model/response/MovieConfigResponse;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_7
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->b:Lo7/k;

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    move-object v2, v0

    .line 109
    check-cast v2, Lcom/anilab/data/model/response/DownloaderResponse;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :pswitch_8
    invoke-virtual {p1}, Lo7/n;->i0()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lo7/n;->j0()V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {p1}, Lo7/n;->s()V

    .line 120
    .line 121
    .line 122
    new-instance v1, Lcom/anilab/data/model/response/AllSettingsResponse;

    .line 123
    .line 124
    invoke-direct/range {v1 .. v9}, Lcom/anilab/data/model/response/AllSettingsResponse;-><init>(Lcom/anilab/data/model/response/DownloaderResponse;Lcom/anilab/data/model/response/MovieConfigResponse;Lcom/anilab/data/model/response/CommentConfigResponse;Lcom/anilab/data/model/response/ContactUsResponse;Lcom/anilab/data/model/response/SrcConfigResponse;Lcom/anilab/data/model/response/ListPlayerResponse;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object v1

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    check-cast p2, Lcom/anilab/data/model/response/AllSettingsResponse;

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
    const-string v0, "download"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->b:Lo7/k;

    .line 19
    .line 20
    iget-object v1, p2, Lcom/anilab/data/model/response/AllSettingsResponse;->a:Lcom/anilab/data/model/response/DownloaderResponse;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "movieConfig"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->c:Lo7/k;

    .line 31
    .line 32
    iget-object v1, p2, Lcom/anilab/data/model/response/AllSettingsResponse;->b:Lcom/anilab/data/model/response/MovieConfigResponse;

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "commentConfig"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->d:Lo7/k;

    .line 43
    .line 44
    iget-object v1, p2, Lcom/anilab/data/model/response/AllSettingsResponse;->c:Lcom/anilab/data/model/response/CommentConfigResponse;

    .line 45
    .line 46
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const-string v0, "contactUs"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->e:Lo7/k;

    .line 55
    .line 56
    iget-object v1, p2, Lcom/anilab/data/model/response/AllSettingsResponse;->d:Lcom/anilab/data/model/response/ContactUsResponse;

    .line 57
    .line 58
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "srcConfig"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->f:Lo7/k;

    .line 67
    .line 68
    iget-object v1, p2, Lcom/anilab/data/model/response/AllSettingsResponse;->e:Lcom/anilab/data/model/response/SrcConfigResponse;

    .line 69
    .line 70
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const-string v0, "player"

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->g:Lo7/k;

    .line 79
    .line 80
    iget-object v1, p2, Lcom/anilab/data/model/response/AllSettingsResponse;->f:Lcom/anilab/data/model/response/ListPlayerResponse;

    .line 81
    .line 82
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const-string v0, "app_token"

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lcom/anilab/data/model/response/AllSettingsResponseJsonAdapter;->h:Lo7/k;

    .line 91
    .line 92
    iget-object v1, p2, Lcom/anilab/data/model/response/AllSettingsResponse;->g:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    const-string v1, "client_id"

    .line 98
    .line 99
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 100
    .line 101
    .line 102
    iget-object p2, p2, Lcom/anilab/data/model/response/AllSettingsResponse;->h:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0, p1, p2}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lo7/q;->g()Lo7/p;

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 112
    .line 113
    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    .line 114
    .line 115
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1
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
    const/16 v0, 0x29

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(AllSettingsResponse)"

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
