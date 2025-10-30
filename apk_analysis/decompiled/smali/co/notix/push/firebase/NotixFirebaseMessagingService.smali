.class public final Lco/notix/push/firebase/NotixFirebaseMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "SourceFile"


# instance fields
.field public final a:LY7/z;

.field public final b:Lco/notix/ra;

.field public final c:Lco/notix/if;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    invoke-static {}, Lco/notix/wq;->f()Lco/notix/g9;

    move-result-object v0

    invoke-virtual {v0}, Lco/notix/g9;->b()LY7/z;

    move-result-object v0

    iput-object v0, p0, Lco/notix/push/firebase/NotixFirebaseMessagingService;->a:LY7/z;

    invoke-static {}, Lco/notix/wq;->h()Lco/notix/ra;

    move-result-object v0

    iput-object v0, p0, Lco/notix/push/firebase/NotixFirebaseMessagingService;->b:Lco/notix/ra;

    invoke-static {}, Lco/notix/wq;->n()Lco/notix/if;

    move-result-object v0

    iput-object v0, p0, Lco/notix/push/firebase/NotixFirebaseMessagingService;->c:Lco/notix/if;

    return-void
.end method


# virtual methods
.method public final onMessageReceived(Lcom/google/firebase/messaging/r;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/push/firebase/NotixFirebaseMessagingService;->a:LY7/z;

    new-instance v1, Lco/notix/pg;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lco/notix/pg;-><init>(Lcom/google/firebase/messaging/r;Lco/notix/push/firebase/NotixFirebaseMessagingService;LE7/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public final onNewToken(Ljava/lang/String;)V
    .locals 3

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/push/firebase/NotixFirebaseMessagingService;->a:LY7/z;

    new-instance v1, Lco/notix/qg;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lco/notix/qg;-><init>(Lco/notix/push/firebase/NotixFirebaseMessagingService;Ljava/lang/String;LE7/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method
