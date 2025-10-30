.class public final Lt0/l;
.super Landroid/media/MediaRouter2$TransferCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lt0/m;


# direct methods
.method public constructor <init>(Lt0/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt0/l;->a:Lt0/m;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/MediaRouter2$TransferCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final onStop(Landroid/media/MediaRouter2$RoutingController;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt0/l;->a:Lt0/m;

    .line 2
    .line 3
    iget-object v1, v0, Lt0/m;->k:Landroid/util/ArrayMap;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lt0/s;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget-object p1, v0, Lt0/m;->j:Lcom/google/firebase/messaging/u;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lt0/e;

    .line 18
    .line 19
    iget-object v0, p1, Lt0/e;->e:Lt0/s;

    .line 20
    .line 21
    if-ne v1, v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lt0/e;->c()Lt0/C;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, Lt0/e;->g()Lt0/C;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eq v1, v0, :cond_0

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-virtual {p1, v0, v2, v1}, Lt0/e;->k(Lt0/C;IZ)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :cond_1
    sget p1, Lt0/e;->F:I

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "onStop: No matching routeController found. routingController="

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v0, "MR2Provider"

    .line 57
    .line 58
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    return-void
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
.end method

.method public final onTransfer(Landroid/media/MediaRouter2$RoutingController;Landroid/media/MediaRouter2$RoutingController;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lt0/l;->a:Lt0/m;

    .line 2
    .line 3
    iget-object v0, v0, Lt0/m;->k:Landroid/util/ArrayMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lt0/l;->a:Lt0/m;

    .line 9
    .line 10
    iget-object p1, p1, Lt0/m;->i:Landroid/media/MediaRouter2;

    .line 11
    .line 12
    invoke-static {p1}, Lt0/f;->d(Landroid/media/MediaRouter2;)Landroid/media/MediaRouter2$RoutingController;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x1

    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne p2, p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lt0/l;->a:Lt0/m;

    .line 21
    .line 22
    iget-object p1, p1, Lt0/m;->j:Lcom/google/firebase/messaging/u;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lt0/e;

    .line 27
    .line 28
    invoke-virtual {p1}, Lt0/e;->c()Lt0/C;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1}, Lt0/e;->g()Lt0/C;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eq v2, p2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1, p2, v1, v0}, Lt0/e;->k(Lt0/C;IZ)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    invoke-static {p2}, LP/x0;->n(Landroid/media/MediaRouter2$RoutingController;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    const-string p1, "MR2Provider"

    .line 53
    .line 54
    const-string p2, "Selected routes are empty. This shouldn\'t happen."

    .line 55
    .line 56
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    const/4 v2, 0x0

    .line 61
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, LP/x0;->h(Ljava/lang/Object;)Landroid/media/MediaRoute2Info;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Lt0/f;->l(Landroid/media/MediaRoute2Info;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance v3, Lt0/i;

    .line 74
    .line 75
    iget-object v4, p0, Lt0/l;->a:Lt0/m;

    .line 76
    .line 77
    invoke-direct {v3, v4, p2, p1}, Lt0/i;-><init>(Lt0/m;Landroid/media/MediaRouter2$RoutingController;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v4, p0, Lt0/l;->a:Lt0/m;

    .line 81
    .line 82
    iget-object v4, v4, Lt0/m;->k:Landroid/util/ArrayMap;

    .line 83
    .line 84
    invoke-virtual {v4, p2, v3}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    iget-object v3, p0, Lt0/l;->a:Lt0/m;

    .line 88
    .line 89
    iget-object v3, v3, Lt0/m;->j:Lcom/google/firebase/messaging/u;

    .line 90
    .line 91
    iget-object v3, v3, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v3, Lt0/e;

    .line 94
    .line 95
    iget-object v4, v3, Lt0/e;->i:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    :cond_3
    :goto_0
    if-ge v2, v5, :cond_5

    .line 102
    .line 103
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    check-cast v6, Lt0/C;

    .line 110
    .line 111
    invoke-virtual {v6}, Lt0/C;->c()Lt0/u;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    iget-object v8, v3, Lt0/e;->r:Lt0/m;

    .line 116
    .line 117
    if-eq v7, v8, :cond_4

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    iget-object v7, v6, Lt0/C;->b:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {p1, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-eqz v7, :cond_3

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    const/4 v6, 0x0

    .line 130
    :goto_1
    if-nez v6, :cond_6

    .line 131
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, "onSelectRoute: The target RouteInfo is not found for descriptorId="

    .line 135
    .line 136
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const-string v0, "AxMediaRouter"

    .line 147
    .line 148
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_6
    invoke-virtual {v3, v6, v1, v0}, Lt0/e;->k(Lt0/C;IZ)V

    .line 153
    .line 154
    .line 155
    :goto_2
    iget-object p1, p0, Lt0/l;->a:Lt0/m;

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Lt0/m;->j(Landroid/media/MediaRouter2$RoutingController;)V

    .line 158
    .line 159
    .line 160
    return-void
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

.method public final onTransferFailure(Landroid/media/MediaRoute2Info;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Transfer failed. requestedRoute="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "MR2Provider"

    .line 16
    .line 17
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    return-void
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
