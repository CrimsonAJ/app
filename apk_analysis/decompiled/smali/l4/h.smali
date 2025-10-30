.class public final synthetic Ll4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:Ll4/l;


# direct methods
.method public synthetic constructor <init>(Ll4/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/h;->a:Ll4/l;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 5

    .line 1
    iget-object p1, p0, Ll4/h;->a:Ll4/l;

    .line 2
    .line 3
    iget-object v0, p1, Ll4/l;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ll4/k;

    .line 20
    .line 21
    iget-boolean v2, v1, Ll4/k;->d:Z

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-boolean v2, v1, Ll4/k;->c:Z

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v2, v1, Ll4/k;->b:LA6/i;

    .line 31
    .line 32
    invoke-virtual {v2}, LA6/i;->c()Ll4/f;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v4, LA6/i;

    .line 37
    .line 38
    invoke-direct {v4}, LA6/i;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v4, v1, Ll4/k;->b:LA6/i;

    .line 42
    .line 43
    iput-boolean v3, v1, Ll4/k;->c:Z

    .line 44
    .line 45
    iget-object v1, v1, Ll4/k;->a:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v4, p1, Ll4/l;->c:Ll4/j;

    .line 48
    .line 49
    invoke-interface {v4, v1, v2}, Ll4/j;->a(Ljava/lang/Object;Ll4/f;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v1, p1, Ll4/l;->b:Ll4/w;

    .line 53
    .line 54
    iget-object v1, v1, Ll4/w;->a:Landroid/os/Handler;

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Landroid/os/Handler;->hasMessages(I)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    :cond_2
    const/4 p1, 0x1

    .line 63
    return p1
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
