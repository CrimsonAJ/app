.class public final synthetic Lt6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Lcom/google/firebase/messaging/u;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lcom/google/firebase/messaging/u;I)V
    .locals 0

    .line 1
    iput p3, p0, Lt6/b;->a:I

    iput-object p1, p0, Lt6/b;->b:Ljava/lang/Runnable;

    iput-object p2, p0, Lt6/b;->c:Lcom/google/firebase/messaging/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lt6/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt6/b;->b:Ljava/lang/Runnable;

    .line 7
    .line 8
    iget-object v1, p0, Lt6/b;->c:Lcom/google/firebase/messaging/u;

    .line 9
    .line 10
    iget-object v1, v1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lt6/h;

    .line 13
    .line 14
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {v1, v0}, Lu/g;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    invoke-virtual {v1, v0}, Lu/g;->k(Ljava/lang/Throwable;)Z

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :pswitch_0
    iget-object v0, p0, Lt6/b;->b:Ljava/lang/Runnable;

    .line 28
    .line 29
    :try_start_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catch_1
    move-exception v0

    .line 34
    iget-object v1, p0, Lt6/b;->c:Lcom/google/firebase/messaging/u;

    .line 35
    .line 36
    iget-object v1, v1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lt6/h;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lu/g;->k(Ljava/lang/Throwable;)Z

    .line 41
    .line 42
    .line 43
    :goto_1
    return-void

    .line 44
    :pswitch_1
    iget-object v0, p0, Lt6/b;->b:Ljava/lang/Runnable;

    .line 45
    .line 46
    :try_start_2
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_2
    move-exception v0

    .line 51
    iget-object v1, p0, Lt6/b;->c:Lcom/google/firebase/messaging/u;

    .line 52
    .line 53
    iget-object v1, v1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lt6/h;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Lu/g;->k(Ljava/lang/Throwable;)Z

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
