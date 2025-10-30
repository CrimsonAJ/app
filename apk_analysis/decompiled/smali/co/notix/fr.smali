.class public final Lco/notix/fr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/xq;

.field public b:Lco/notix/push/NotixTargetEventHandler;


# direct methods
.method public constructor <init>(Lco/notix/xq;)V
    .locals 1

    const-string v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/fr;->a:Lco/notix/xq;

    return-void
.end method
